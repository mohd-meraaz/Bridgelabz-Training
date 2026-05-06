package com.collections.votingsystem;
import java.util.Scanner;

public class VotingSystemApp {
	public static void main(String[] args) {
		System.out.println("------------Bharat Voting Booth---------");
		Scanner sc = new Scanner(System.in);
		Candidate can = null;
		VotingSystem votesys = new VotingSystem();
		votesys.addCandidate("BJP");
		votesys.addCandidate("Congress");
		votesys.addCandidate("Aap");
		votesys.addCandidate("Nota");
		do {
			System.out.println("\nEnter '1' to vote            : ");
			System.out.println("Enter '2' to view Candidates : ");
			System.out.println("Enter '3' to view result     : ");
			System.out.println("Enter '4' to exit            : ");
			int n = sc.nextInt();
			sc.nextLine();
			if(n==1) {
				System.out.println("\nEnter Your Name          : ");
				String name = sc.nextLine();
				can = new Candidate(name);
				System.out.println("Enter Party Name          : ");
				String part = sc.nextLine();
				votesys.vote(part, can);
			}else if(n==2) {
					votesys.view();
			}else if(n==3) {
					votesys.result();
			}else {
				System.out.println("Voting is right for every one");
				break;
				}
			}while(true);
		}
	}