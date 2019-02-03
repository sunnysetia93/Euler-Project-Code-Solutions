fn main() {
	
	fn sum_of_multiples(factor: f64, limit: f64) -> f64 {
		let last_multiple: f64 = limit - (limit % factor);
		let number_of_multiples: f64 = last_multiple / factor;
		(factor + last_multiple)*(number_of_multiples/2.0)
	}

	let sum_of_multiples_of_3 = sum_of_multiples(3.0, 999.0);
	let sum_of_multiples_of_5 = sum_of_multiples(5.0, 999.0);
	let sum_of_multiples_of_15 = sum_of_multiples(15.0, 999.0);
	
	

	let sum = sum_of_multiples_of_3 + sum_of_multiples_of_5 - sum_of_multiples_of_15;

	println!("Sum of products is {}",sum);
}