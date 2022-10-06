use colored::*;
use rand::Rng;
use std::cmp::Ordering;
use std::io;

fn main() {
    println!("Welcome to the game");

    // let is a constant variable
    let secret_number = rand::thread_rng().gen_range(1, 101);

    // Print the secret number
    println!("The secret number is {}", secret_number);

    loop {
        println!("Guess the number");

        // &mut is a reference to a mutable variable
        let mut guess = String::new();

        io::stdin()
            .read_line(&mut guess)
            .expect("Failed to read line");

        // parse the string to an integer
        let guess: u32 = match guess.trim().parse() {
            Ok(num) => num,
            Err(_) => continue,
        };

        // Print the guessed number
        println!("You guessed: {}", guess);
        // Compare the guessed number to the secret number
        match guess.cmp(&secret_number) {
            // If the guessed number is equal to the secret number
            Ordering::Equal => {
                println!("{}", "You win!".green());
                break;
            }
            // If the guessed number is less than the secret number
            Ordering::Less => {
                println!("{}", "Too small!".red());
            }
            // If the guessed number is greater than the secret number
            Ordering::Greater => {
                println!("{}", "Too big!".red());
            }
        }
    }
}
