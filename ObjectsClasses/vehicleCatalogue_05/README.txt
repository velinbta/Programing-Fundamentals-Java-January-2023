5. Vehicle Catalogue
You have to make a catalog for vehicles. You will receive two types of vehicles - a car or a truck. 
Until you receive the command "End" you will receive lines of input in the format:

{typeOfVehicle} {model} {color} {horsepower}
After the "End" command, you will start receiving models of vehicles. Print for every received vehicle its data in the format:
Type: {typeOfVehicle}
Model: {modelOfVehicle}
Color: {colorOfVehicle}
Horsepower: {horsepowerOfVehicle}

When you receive the command "Close the Catalogue", stop receiving input and print the average horsepower for the cars and the trucks in the format:
"{typeOfVehicles} have average horsepower of {averageHorsepower}."
The average horsepower is calculated by dividing the sum of horsepower for all vehicles of the type by the total count of vehicles from the same type.
Format the answer to the 2nd decimal point.

Constraints
The type of vehicle will always be a car or truck.
You will not receive the same model twice.
The received horsepower will be an integer in the interval [1.....1000].
You will receive at most 50 vehicles.
Single whitespace will be used for the separator.

Examples:

Input 1:
truck Man red 200
truck Mercedes blue 300
car Ford green 120
car Ferrari red 550
car Lamborghini orange 570
End
Ferrari
Ford
Man
Close the Catalogue

Output 1:
Type: Car
Model: Ferrari
Color: red
Horsepower: 550
Type: Car
Model: Ford
Color: green
Horsepower: 120
Type: Truck
Model: Man
Color: red
Horsepower: 200
Cars have average horsepower of: 413.33.
Trucks have average horsepower of: 250.00.

Input 2:
car Opel green 736
End
Close the Catalogue

Output 2:
Cars have average horsepower of: 736.00.
Trucks have average horsepower of: 0.00.