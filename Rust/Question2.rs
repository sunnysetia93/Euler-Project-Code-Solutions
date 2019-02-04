const PAR_VALUE: usize = 4000000;
fn main() {
	println!("{:?}", even_fibonacci_sum(1,1,0));
}

fn even_fibonacci_sum(first_fibonacci_term: usize, second_fibonacci_term: usize, sum_of_fibonacci: usize) -> usize {
	let new_fibonacci_term = first_fibonacci_term + second_fibonacci_term;
	if new_fibonacci_term > PAR_VALUE {
		sum_of_fibonacci
	}
	else {
		even_fibonacci_sum(new_fibonacci_term + second_fibonacci_term,
		 2 * new_fibonacci_term + second_fibonacci_term,
		 sum_of_fibonacci + new_fibonacci_term)
	}
}