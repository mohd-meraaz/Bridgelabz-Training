package com.logicalQuestion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LogicalQuestion {
	public static void main(String[] args) {
//		Java 8 Logical Questions
//
//		1. Count vowels in a string using Stream
//		Input: "programming"
//		Output: 3
		String str = "programming eazy";
		long countVowels = str.chars().mapToObj(s->(char)s).filter(s->"aeiouAEIOU".indexOf(s)!=-1).count();
		System.out.println(countVowels);
//
//		2. Count number of words in a sentence
//		Input: "Java is very powerful"
//		Output: 4
		String str2 = "Java is very powerful";
		long countWords = Arrays.stream(str2.split(" ")).count();
		System.out.println(countWords);
//
//		3. Find even numbers from list
//		Input: [2,5,7,8,10,13]
//		Output: [2,8,10]
//
		int[] arr = {2,5,7,8,10,13};
		int[] arrayList = Arrays.stream(arr).
				filter(x->x%2==0).toArray();
		
		System.out.println(arrayList);
		
		
//		4. Convert list of strings to uppercase
//		Input: ["java","spring","boot"]
//		Output: ["JAVA","SPRING","BOOT"]
//
//		5. Find string length list
//		Input: ["cat","elephant","dog"]
//		Output: [3,8,3]
//
//		6. Count strings starting with ‘a’
//		Input: ["apple","banana","ant","car"]
//		Output: 2
//
//		7. Remove empty strings
//		Input: ["java","","spring","","boot"]
//		Output: ["java","spring","boot"]
//
//		8. Sum of all numbers using stream
//		Input: [1,2,3,4,5]
//		Output: 15
//
//		9. Find max number
//		Input: [10,25,3,99,45]
//		Output: 99
//
//		10. Reverse each string in list
//		Input: ["java","api"]
//		Output: ["avaj","ipa"]
//
//		11. Remove duplicate elements from list
//		Input: [1,2,2,3,4,4,5]
//		Output: [1,2,3,4,5]
//
//		12. Sort list in descending order
//		Input: [5,1,9,3]
//		Output: [9,5,3,1]
//
//		13. Find second highest number
//		Input: [10,40,30,20]
//		Output: 30
//
//		14. Join strings with comma
//		Input: ["Java","Spring","Boot"]
//		Output: "Java,Spring,Boot"
//
//		15. Frequency of each character
//		Input: "banana"
//		Output: {b=1, a=3, n=2}
//
//		16. Find numbers greater than 50
//		Input: [10,55,60,23,90]
//		Output: [55,60,90]
//
//		17. Group strings by length
//		Input: ["a","bb","ccc","dd"]
//		Output: {1=[a], 2=[bb,dd], 3=[ccc]}
//
//		18. Find first non-repeated character
//		Input: "stress"
//		Output: t
//
//		19. Convert List<Integer> to List<String>
//		Input: [1,2,3]
//		Output: ["1","2","3"]
//
//		20. Count occurrences of each word
//		Input: "java is java and java is fast"
//		Output: {java=3, is=2, and=1, fast=1}
//
//		21. Partition numbers into even and odd
//		Input: [1,2,3,4,5,6]
//		Output: {even=[2,4,6], odd=[1,3,5]}
//
//		22. Find duplicate elements only
//		Input: [1,2,3,2,4,5,1]
//		Output: [1,2]
//
//		23. Find longest string
//		Input: ["java","microservices","api"]
//		Output: "microservices"
//
//		24. Find top 3 highest numbers
//		Input: [10,90,30,70,50]
//		Output: [90,70,50]
//
//		25. Flatten list of lists
//		Input: [[1,2],[3,4],[5]]
//		Output: [1,2,3,4,5]
//
//		26. Find sum of squares of even numbers
//		Input: [1,2,3,4,5]
//		Output: 20 (2² + 4²)
//
//		27. Sort map by value
//		Input: {A=3, B=1, C=2}
//		Output: {B=1, C=2, A=3}
//
//		28. Find employee with highest salary (using stream)
//		Input: List of Employees
//		Output: Employee object with max salary
//
//		29. Find common elements between two lists
//		Input: [1,2,3,4] and [3,4,5,6]
//		Output: [3,4]
//
//		30. Find kth smallest element
//		Input: [9,1,5,3,7], k=2
//		Output: 3
	}
}
