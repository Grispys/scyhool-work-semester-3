#!/usr/bin/env node

const process = require('node:process');

const userArguments = process.argv.slice(2);

// creates the length flag, 8 is default if lengtharg not given
const lengthArg = process.argv[3]
const length = parseInt(lengthArg, 8) || 8;

// creates the customization flag
const customArg = process.argv;[4]


function errors(){
    console.error(
        `Error: arguments cannot be empty. Try '--help' to see more info.`
    )
}


// default password generator, only lower case
function generateDefault(value) {
    let result = ' ';
    let length = value;
    const characters = 'abcdefghijklmnopqrstuvwxyz'
    for(let i = 0; i < length; i++) {
        const randomChars = Math.floor(Math.random()* characters.length);
        result += characters[randomChars]
    }
    return result;
}

// password generator that allows numbers
function generateWNums(value) {
    let result = ' ';
    let length = value;
    const characters='abcdefghijklmnopqrstuvwxyz1234567890'; //both letters and numbers
    for(let i = 0; i < length; i++) {
        const randomChars = Math.floor(Math.random() * characters.length);
        result += characters[randomChars]
    }
    return result;
}


if (userArguments.includes('--help')){
    console.error(`
        Usage:
            --help      Brings up this message
            --pwmake    Creates a password with default settings
                        Default settings are: 8 characters, only low-case.
                        To change settings, syntax is as follows:
                        --pwmake (length) (allowedchar)
                        Length is an integer of your choice.
                        allowedchar (a = all, c = allow capitals, n = allow
                        numbers, s = allow symbols) changes content of the password.
            

        `)       
}else if (userArguments.length ==0){
    errors();
    return;

}else if (userArguments.includes('--pwmake') && customArg.includes('n')){
    console.log("New Password: " +  generateWNums(length))

}else if (userArguments.includes('--pwmake')){
    console.log("New Password: " +  generateDefault(length))
}

