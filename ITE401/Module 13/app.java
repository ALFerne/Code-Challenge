import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Welcome to the Phinma Online Product Feedback Survey!")
    println("Please provide your feedback by answering a few questions.")

    print("Name: ")
    val name = scanner.nextLine()
    
    print("Email: ")
    val email = scanner.nextLine()
    
    println("\nThank you, $name!")

    println("\nPlease rate the following aspects from 1 to 5 (1 = Strongly Disagree, 5 = Strongly Agree)")
    print("User  Interface: ")
    
    val userInterfaceRating = scanner.nextInt()
    
    print("Product Selection: ")
    val productSelectionRating = scanner.nextInt()
    
    print("Delivery Speed: ")
    val deliverySpeedRating = scanner.nextInt()
    
    print("Customer Support: ")
    val customerSupportRating = scanner.nextInt()

    print("Any additional comments? (Press Enter to skip)\n")
    scanner.nextLine() 
    val comments = scanner.nextLine()

    println("\nThank you for your feedback, $name!")
    println("Summary of Your Feedback:")
    println("Email: $email")
    println("User  Interface Rating: $userInterfaceRating")
    println("Product Selection Rating: $productSelectionRating")
    println("Delivery Speed Rating: $deliverySpeedRating")
    println("Customer Support Rating: $customerSupportRating")
    println("Additional Comments: $comments")
}
