#Specification

This Project provides an implementation for a *Recipe Book* in Java. This *Recipe Book* allows for a *User* to have functionality such as:

* Reading *Dish* information from a specifically formatted file and adding to the *Recipe Book*
* Manually adding a new *Dish* to the *Recipe Book* from within the program. For example, adding 'Pepperoni Pizza' to the *Recipe Book* during runtime.
* Searching for a *Dish* or Dishes in the *Recipe Book* by name, favourites, cook time, user preferences, certain attributes (Vegetarian, Non-Vegetarian, Kosher)
  and whether it contains certain *Ingredient*(s) (eg: Searching for dishes that contain *Potato*)
* Generation of a shopping list based on the *Dish*(s) favourite by the *User*

Each *Dish* in the *Recipe Book* must store information such as name, *Ingredient*(s), cook time, attributes (Veg, Non-Veg, etc.) and
cooking instructions.

Each *Ingredient* used in a *Dish* must store information such as name and its attributes (Veg, Non-Veg, Vegan, etc.)

Each *User* will have their own instance of a *Recipe Book* and will be able to mark their favourite dishes,
add notes to a *Dish* and have a list of preferences which can be used to search for dishes in the *Recipe Book*.
When a new User is created, default dishes will be read from a file and added to the User's
Recipe Book.

When the program is launched, the user will be able to enter their username to sign in to the program. If no users exist
in the user list stored in the program, a user will be automatically created. Users have the option to create a new account, sign out, and access
various features of the Recipe Book once they are signed in through commands in a prompt. Below is a list of commands that the user can input to interact with the Recipe Book. 


Commands:

* END exits the program
* signOut signs out the current user
* Create Dish allows the user to create their own dish
* Search accesses the search functionality, where users can pick their search filters
* Create Ingredient allows the user to add their own ingredients
* setPreferences displays a list of allergy and diet options that the user can choose to set as default search parameters
* addFavourite _DISHNAME_ puts a dish in a user's favourite list
* getList returns a list of ingredients needed to make various dishes in user's favourites
* Preferences displays the current user's preferences 
* Favourites displays the current user's favourite dishes 
* View Dishes displays a random list of dishes in the Recipe Book
