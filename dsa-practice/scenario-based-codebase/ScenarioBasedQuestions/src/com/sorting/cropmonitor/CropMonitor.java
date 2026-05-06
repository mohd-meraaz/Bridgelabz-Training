package com.sorting.cropmonitor;

public class CropMonitor {
	public static void main(String[] args) {
		Sensor[] sensor = {new Sensor(12.4), new Sensor(32.2), new Sensor(44.5), new Sensor(2.54), new Sensor(1.4)};
		
		Sensor[] result = merge(sensor,0,sensor.length-1);
		
		//display
		System.out.println("Sorted tempreature");
		for(Sensor s: result) {
			System.out.println(s.soiltemperatures);
		}
	}
	
	// MergeSort Helper function 
	public static Sensor[] merge(Sensor sensor[], int l, int r) {
		if(l>=r) {
			return new Sensor[] {sensor[r]};
		}
		int mid = (l+r)/2;
		
		Sensor[] left = merge(sensor,l,mid);
		Sensor[] right = merge(sensor,mid+1,r);
		
		return mergeSort(left,right);
	}
	
	// // MergeSort
	public static Sensor[] mergeSort(Sensor left[], Sensor right[]) {
		
		Sensor[] result = new Sensor[left.length+right.length];
		
		int i=0,j=0,k=0;
		while(i<left.length && j<right.length) {
			if(left[i].soiltemperatures<right[j].soiltemperatures) {
				result[k++] = left[i++];
			}else {
				result[k++] = right[j++];
			}
		}
		
		while(i<left.length) {
			result[k++] = left[i++];
		}
		
		while(j<right.length) {
			result[k++] = right[j++];
		}
		return result;
	}

}
