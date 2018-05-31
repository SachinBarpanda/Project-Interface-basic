# Project-Interface-basic
Making a small project to help to learn Interface.
       
        1. Create a simple interface that allows an object to be saved to some sort of storage medium.
        2. The exact type of medium is not known to the interface (nor to the classes that implement it).
        3. The interface will just specify 2 methods, one to return an ArrayList of values to be saved
           and the other to populate the object's fields from an ArrayList.
        
        4. Create some sample classes that implement your saveable interface (we will use the idea of a game,
           with Players and Monsters, but you can create any type of classes that you want).
        
        5. Override the toString() method for each of your classes so that they can be easily printed to enable
           the program to be tested easier.
        
        6. In Main, write a method that takes an object that implements the interface as a parameter and
           "saves" the values.
        7. We haven't covered I/O yet, so your method should just print the values to the screen.
        8. Also in Main, write a method that restores the values to a saveable object.
        9. Again, we are not going to use Java file I/O; instead use the readValues() method below to
           simulate getting values from a file – this allows you to type as many values as your class
           requires, and returns an ArrayList.
