#!/usr/bin/env node

const process = require('node:process');

function getWordCount(text){
    return  text.trim().split(" ").length;
}
function printHelp(){
    console.error(
        `Usage: test-statistics "<text>"
         Example:
            test-statistics/node \index.js "this is text"
        `
    );
}


const userArguments = process.argv.slice(2);
if (userArguments.length !== 1) {
    printHelp();
    return;
}

console.log(`the number of words in ${userArguments[0]} is: ${getWordCount(userArguments[0])}`);

console.log(`word count of "hello world this is a test" is: ${getWordCount("Hello World this is a test")}`);