fun main() {
    println("Hello, Android") 
    val x = 1
    val y = 3
    
    println(x)
    val z = x+y
    println(z)
    
    val name = "Fekah"
    println(name)
    val name1 = "Nur Fekah"
    println(name1)
    
    // : of type of declaration variable
    val address:String = "Petaling Jaya"
    println(address)
    
    val jantina:Char = 'P'
    println(jantina)
    
    //Operasi
    //+
    val message = "My name is " + name + " and I live in "+address
    println(message)
    
    //String interpolation
    val anotherMessage = "My name is $name and I live in $address"
    println(anotherMessage)
    
    var num1:Int = 9
    var num2:Int = 5
    
    var sum:Int = num1 + num2
    println(sum)
    
    // Operasi +, -, /, %(modulos)
    var minus = num1 - num2
    println(minus)
    
    var product = num1 * num2
    println(product)
    
    var division = num1/num2
    println(division)
    
    var modulo = num1 % num2
    println(modulo)
    
    // Boolean (true or false)
    var eaten = true
    var tired:Boolean = false
    
    // Boolean operation : && (AND), || (OR). ! (NOT/Reverse)
    
    println(eaten && tired)
    println(eaten || tired)
    println(!eaten) //Reverse kalau true akan jadi false, false akan jd true
    
    var profession = null
    
    var newProfession: String? = null //question ark to indicate whether the it has value or empty
    println(newProfession)
    println(profession)
    newProfession = "Trainer"
    println(newProfession)
   
 var tinggi = 170.0
    var berat = 70
    var bmi = berat/((tinggi / 100)*(tinggi / 100))
    println(bmi)
    
    //Array
    var scores = arrayOf(70,90,100,80,85,60)
    
    println(scores[0]) //to retrieve the first item in the array
    println(scores[1])
    println(scores.size) //how many item in the array (length)
    }
