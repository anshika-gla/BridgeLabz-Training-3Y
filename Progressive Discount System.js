
let total = 7800;

let discountPercentage = 0;


if (total >= 10000) {
    discountPercentage = 25;
} 
else if (total >= 5000) {
    discountPercentage = 15;
}
else if (total >= 2000) {
    discountPercentage = 5;
}
else {
    discountPercentage = 0;
}


let discountAmount = (total * discountPercentage) / 100;


let finalPrice = total - discountAmount;


console.log(`Original Total: ₹${Math.round(total)}`);
console.log(`Discount Applied: ${discountPercentage}%`);
console.log(`Final Price After Discount: ₹${Math.round(finalPrice)}`);
