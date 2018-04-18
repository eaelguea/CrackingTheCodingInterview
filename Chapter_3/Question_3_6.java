
/**
 * Chapter 3 questions
 * Problems from Cracking the Coding Interview
 * @author Eric Elguea
 *
 *  An animal shelter holds only dogs and cats,
    * and operates on a strictly "first in, first out"
    *  basis. People must adopt either the "oldest" (based on arrival time) of all animals at the 
    *  shelter, or they can select whether they would prefer a dog or a cat (and will receive the oldest
    *  animal of that type). They cannot select which specific animal they would like. Create the data
    *  structures to maintain this system and implement operations such as enqueue, dequeueAny, 
    *  dequeueDog and dequeueCat.You may use the built-in LinkedList data structure.
*/

import java.util.Queue;
import java.util.LinkedList;
import java.util.Date;
import java.util.List;
import java.util.Arrays;

public class Question_3_6 {
    public static void main(String[] args) throws Exception{
        AnimalShelter shelter = new AnimalShelter();
        List<Animal> animals = Arrays.asList(
				new Dog(),new Cat(),new Dog(),new Cat(),new Dog(), new Cat(),
				new Dog(),new Cat(),new Dog(),new Cat()
				);
		for(Animal animal : animals)
			shelter.enqueue(animal);
		shelter.dequeueA();
		shelter.dequeueCat();
		shelter.dequeueDog();
		System.out.println(shelter.cats.size());
		System.out.println(shelter.dogs.size());
	}
}

class Animal {
    String name;
    Date date;
}

class Dog extends Animal {
    Dog(){
        super();
        name = "dog";
    }
}

class Cat extends Animal {
    Cat(){
        super();
        name = "cat";
    }
}

class AnimalShelter {
    Queue<Dog> dogs;
    Queue<Cat> cats;
    
    public AnimalShelter(){
        dogs = new LinkedList<Dog>();
        cats = new LinkedList<Cat>();
    }
    
    public void enqueue(Animal animal) throws Exception {
        boolean isCat = animal.name.equals("cat");
        boolean isDog = animal.name.equals("dog");
        
        if((!isCat) && (!isDog))
            throw new Exception("Animal is unknown");
        animal.date = new Date();
        
        if(isCat){
            if(animal instanceof Cat)
                cats.offer((Cat) animal);
        }
        
        if(isDog){
            if(animal instanceof Dog)
                dogs.offer((Dog) animal);
        }
    }
    
    public Animal dequeueA() throws Exception {
        boolean noC = cats.isEmpty();
        boolean noD = dogs.isEmpty();
        if(noC && noD)
            throw new Exception("No more animals");
        if(noC)
            return dogs.poll();
        else if (noD)
            return cats.poll();
        else
            return cats.peek().date.compareTo(dogs.peek().date) < 0 ? cats.poll(): dogs.poll();
    }
    
    public Cat dequeueCat() throws Exception {
		boolean noCat = cats.isEmpty();
		if (noCat)
			throw new Exception("There are no more cats!");
		return cats.poll();
	}
 
	public Dog dequeueDog() throws Exception {
		boolean noDog = dogs.isEmpty();
		if (noDog)
			throw new Exception("There are no more dogs!");
		return dogs.poll();
	}
}