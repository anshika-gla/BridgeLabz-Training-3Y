
let marks = [88, 92, 79, 85, 90];  


let total = 0;
for (let i = 0; i < marks.length; i++) {
    total += marks[i];
}


let average = total / marks.length;
let percentage = (total / (marks.length * 100)) * 100;


console.log(`Total Marks: ${total}`);
console.log(`Average Marks: ${average.toFixed(2)}`);
console.log(`Percentage: ${percentage.toFixed(2)}%`);

if (percentage >= 85) {
    console.log("Promoted with Distinction");
}
else if (percentage >= 50 && percentage < 85) {
    console.log("Promoted");
}
else {
    console.log("Detained");
}
