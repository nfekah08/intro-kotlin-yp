/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    var tinggi = 170.0
    var berat = 70
    var bmi = berat/((tinggi / 100)*(tinggi / 100))
    println(bmi)
    
    
    // Control flow
    
    var myAge = 16
    
    if(myAge < 18){
    	println("You are under age")
    }
    println("The End")
    
    if(myAge < 18){
        println("You are under age")
    } else {
        println("You can watch the movie")
    }
    
    // IF, else of, else (jika, dan jika, dan lain lain)
    
    if(myAge < 13){
        println("You cannot watch the movie")
    }
    else if(myAge <18){
        println("You can watch with the parent (PG)")
    } else {
        println("You can watch the movie")
    }
    
    // bawah 13 tahun tak boleh
    // 13 tahun ke atas kena ada parent
    // 18 tahun ke atas boleh
    
    var childAge = 17
    var parent = true
    
    if(childAge < 13){
        println("You cannot watch the movie")
    } else if(childAge < 18 && parent == false){
        println("You cannot watch the movie")
    } else if(childAge < 18 && parent == true){
        println("You can watch the movie")
    } else{
        println("You can watch the movie")
    }
    
    println("------------------------------")
    
    if(childAge < 13 || childAge < 17 && parent == true){
        println("You cannot watch the movie")
    } else {
        println("You can watch the movie")
    }
    	
    println("------------------------------")
    
    // When (other language is switch case)
    
    var size = 1
    var price:Int? = null
    
    when (size) {
        1-> price = 5
        2-> price = 7
        3-> price = 10
        else-> println("We dont support other sizes")  //default
    }
    println(price)
    
    when {
	childAge < 13 -> println("You cannot watch movie")
	childAge < 18 && parent == false -> println("You cannot watch the movie")
	childAge < 18 && parent == true -> println("You can watch the movie")
	else -> println("You can watch the movie")
	}
    
     println("------------------------------")
     
    // For loop
    println("menaik")
    for(i in 0..5){
        println("i=$i") // dari 0 sehingga 5, keluarkan nilai i
    }
     
    println("------------------------------")
    println("menurun")
    for(i in 5 downTo 0){
        println("i=$i")
    }
    
    println("------------------------------")
    println("menaik tambah 2")
    for(i in 1..5 step 2){
        println("i=$i")
    }
     println("------------------------------")
    println("menurun kurang 2") 
    for(i in 5 downTo 1 step 2){
        println("i=$i")
    }
    
    println("------------------------------")
    var language = arrayOf("Ruby", "Kotlin", "Python", "Java")
    
    for(item in language){
        println(item)
    }
     println("------------------------------")
     
     //languages.size = 4
     // dari 0 sehingga 3
     //item start from 0, 1,2, 3
     //language[0] = "Ruby", language[1] = "Kotlin"..
     //${} -> interpolation kalau ada function
     
     for (i in 0 .. language.size -1){
         println("Item at index $i is ${language[i]}")
     }
    
        println("------------------------------")
     //while
     var x1=30
    while (x1 <= 5){
        println("x1 = $x1")
        x1++ //selagi nilai x1 kurang dari 5, keluarkan nilai x1 dan tambah 1 setiap kali
    }
     
     println("------------------------------")
     //Do while
     // selagi => but do while will ensure that the code inside to be executed at least 1
     var x2 = 30
    do {
        println("x2 = $x2")
        x2++  // dan tambahkan kepada 1
    }
    while(x2<=5) //ulang semula selagi x2 kurang sama dengan 5
    
       println("------------------------------")
     var x3 = 1
    do{
        println("x3=$x3")
        x3++
        if(x3 == 3) break  //keluar dari do while / control flow ni
    }
    while(x3<=5)
    
        println("------------------------------")
        
     var x4 =0
    do {
         x4++
        if(x4 == 3) {continue} //abaikan scenario ini tetapi teruskan ke while
        println("x4=$x4")
    }
   while(x4<=5) 
   
   sayHello() //function invocation/memanggil function
   
   sayGoodbye("Wan")
   sayGoodbye("John")
   
   println(sum(3,4))
   println(calculationBMI(170.0,70.0))
  
}

// Function is a group expression that can be reusable in our code

fun sayHello(){
    println("Hello World") //Declaring a function sayHello, this function will print "Hello World"
}

//function with argument / parameter
fun sayGoodbye(name:String){
    println("Goodbye $name")
}

//function with return type

fun sum(a:Int , b:Int): Int{
    return a + b
}

fun calculationBMI(height:Double, weight:Double): Double{ //formula yang dipulangkan adalah double
    return weight / ((height/100) * (height/100)) //function akan memulangkan formula
}







