IDEAL for Chapter 1



I: Re-state the problem with your own words
D: Define your goals; state the format of your solution
E, A: Use Duke’s 7 steps and include a description on how you broke the problem into sub-problems.
L: Reflect on the whole problem-solving process you went though, and state what you learned

Chapter 1:

Question 1: 
  I: Create a program that checks if a certain word and all of its characters are unique in a certain way.
  D: Figure out exactly how this problem can be approached. How can I create an algorithm that checks exactly every string? 
      I can use a for-loop structure or maybe use a Map structure to continuously check each letter without stopping.
  E, A: Step 1 - I started by using a one char length word and seeing if my Map could possibly check it.
        Step 2 - I saw that it checked it but produced an error so i figured maybe the word should longer.
        Step 3 - Since I increased the word size, I wondered how I would be able to check the word while updating the for loop through each check
        Step 4 - I now tried with a HashMap and traced with a simple 'abcd' word. It worked out better cause the size was more than one char and each was unique.
        Step 5 - I then started to code by using the HashMap library and utilized for-loops to check the word and its characters and see if the element in that
                 was the same as the next one.
        Step 6 - I tried names, mixtures of letters, and the full alphabet. Cases worked well.
        Step 7 - I tried words that had double letters or all letters the same. Crashed.
  L: I was able to break down the problem and I learned that breaking it down and solving bit by bit can benefit to creating great code.

Question 3: 
  I: Create a program that replaces any space in a string with a certain character combination.
  D: Figure out exactly how this problem can be approached. How can I create an algorithm that checks for spaces, and can replace it?
  E, A: Step 1 - I started by trying a singular string variable. But I knew it make take alot of time.
        Step 2 - I saw that it may be easier to separate each char into an array to check them.
        Step 3 - I saw it worked with the array, so why not use it and take my array knowledge to check the characters.
        Step 4 - I traced a simple 'a b c d  ' array. It worked out and maybe i could go larger.
        Step 5 - I then started to code by using the array and utilized for-loops to check the word and its characters and see if the element in that
                 was a space and replaced it.
        Step 6 - I tried names, mixtures of letters, and the full alphabet. Cases worked well.
        Step 7 - I tried words that had double letters or all letters the same. Worked but took some more time.
  L: I was able to break down the problem and I learned that breaking it down and solving bit by bit can benefit to creating great code.
  
Question 7: 
  I: Create a program that given a 2D array, can we rotate it 90 degrees?
  D: Figure out exactly how this problem can be approached. How can I create an algorithm that can rotate while trying to keep time complexity down?
  E, A: Step 1 - I started by refreshing how 2D arrays are read by for-loops.
        Step 2 - I saw that I could hard code the rotations and make sure that each rotation occurs.
        Step 3 - The hard coding worked out when traced. So I went with that apporach.
        Step 4 - 
        Step 5 - I then started to code by hard coding the rotations in for-loops and printing them in another method.
        Step 6 - I tried different sizes smaller than 5. 
        Step 7 - I tried larger arrays. It took alot of time and crashed cause of runtime.
  L: I was able to break down the problem and I learned that breaking it down and solving bit by bit can benefit to creating great code.

Question 8: 
  I: Create a program that replaces a row or column with zeros only if a zero is present.
  D: Figure out exactly how this problem can be approached. Can it be easy to check without overthinking?
  E, A: Step 1 - I started by looking over the previous problem I worked on. They related checking wise so maybe its best to stay with that apporach.
        Step 2 - I saw that it can be void and just check without returning anything.
        Step 3 - Maybe it is easier to break down the matrix to rows and columns in separate arrays. 
        Step 4 - Traced by using the two separate arrays and checking if there is a zero (Boolean).
        Step 5 - I then started to code by acting as if it was a 2D boolean arrya but just separated into two separate parts.
        Step 6 - Variated sizes and they all worked
        Step 7 - I tried doubling sizes and it crashed by runtime error.
  L: I was able to break down the problem and I learned that breaking it down and solving bit by bit can benefit to creating great code.
  
Question 9: 
  I: Create a program that checks is the rotation of a word is a substring of it.
  D: Figure out exactly how this problem can be approached. How can I implement this when i know how to explain it by words?
  E, A: Step 1 - See how substring methods work and how can it be made easier and cleaner.
        Step 2 - Now that it can be easily made, lets see if the rotated word is a substring.
        Step 3 - Maybe increasing the first word size by itself and seeing if the second word is a rotation, it will work out well.
        Step 4 - Traced by using a simple 'abc' string. Made sense and worked out well.
        Step 5 - I started to code by making one line code for subString and utilized a recursive call to rotate the word and see if it is a subString.
        Step 6 - Changed words around and used names.
        Step 7 - Made ridiculously long words and it crashed.
  L: I was able to break down the problem and I learned that breaking it down and solving bit by bit can benefit to creating great code.
