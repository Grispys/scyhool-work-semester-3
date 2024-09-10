#!/usr/bin/env mode
const process = require('node:process');
const { isArgumentsObject } = require('node:util/types');

const args = process.argv.slice(2);


if (args.includes('--greet')) {
    console.log("Hello World!")
}
else if (args.includes('--help')){
    console.log(`
        Usage:
            --greet    Prints "Hello World"
            --help     Brings up this message
        `)
}else{
    console.error("fuck")
}