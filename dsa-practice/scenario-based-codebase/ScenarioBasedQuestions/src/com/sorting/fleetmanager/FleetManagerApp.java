package com.sorting.fleetmanager;

public class FleetManagerApp {

	public static void main(String[] args) {
			
		Vehicle[] vehicle = {new Vehicle("RS220",120000),new Vehicle("BMWM5",4000000),new Vehicle("Range Rover",3410000),new Vehicle("XUV-500",5100000),new Vehicle("SEDAN",7350000),new Vehicle("Beloro",1400000)};
			
		
		Vehicle reslut[] = merge(vehicle,0,vehicle.length-1);
			
			//display
			for(Vehicle s : reslut) {
				System.out.println("\nTime: "+s.vehicleName);
				System.out.println("Amount: "+s.mileage);
			}
		}
		
		//merge sort helper function
		public static Vehicle[] merge(Vehicle sale[], int l, int r) {
			if(l>=r) {
				return new Vehicle[] {sale[r]};
			}
			int mid = (l+r)/2;
			Vehicle left[] = merge(sale,l,mid);
			Vehicle right[] = merge(sale,mid+1,r);
			
			return mergeSort(left,right);
		}
		
		//function for merging array 
		public static Vehicle[] mergeSort(Vehicle left[], Vehicle right[]) {
			int n1 = left.length;
			int n2 = right.length;
			
			Vehicle result[] = new Vehicle[n1+n2];

			int i=0,j=0,k=0;
			
			while(i<n1 && j<n2) {
				if(left[i].mileage<=right[j].mileage) {
					result[k++] = left[i++];
				}else {
					result[k++] = right[j++];
				}
			}
			
			while(i<n1) {
				result[k++] = left[i++];
			}
			
			while(j<n2) {
				result[k++] = right[j++];
			}
			return result;
		}
	}




