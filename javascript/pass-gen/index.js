#!/usr/bin/env node

const process = require('node:process');

const userArguments = process.argv.slice(2);
const lengthArg = process.argv[3]
const length = parseInt(lengthArg, 8) || 8;

function errors(){
    console.error(
        `Error: arguments cannot be empty. Try '--help' to see more info.`
    )
}

function generateDefault(value) {
    let result = ' ';
    let length = value;
    for(let i = 0; i < length; i++) {
        result += 
        String.fromCharCode(97 + Math.floor(Math.random() * 26));
    }
    return result;
}

function generateWNum(value) {
    let result = ' ';
    let length = value;
    for(let i = 0; i < length; i++) {
        result += 
        String.fromCharCode(97 + Math.floor(Math.random() * 26));
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
}else if (userArguments.includes('--pwmake')){
    console.log("New Password: " +  generateDefault(length))
}

