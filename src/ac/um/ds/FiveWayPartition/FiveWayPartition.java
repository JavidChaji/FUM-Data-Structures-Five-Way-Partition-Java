/* Copyright (C) Fateme Chaji, Ferdowsi Univerity of Mashhad
 * 25 Esfand 1396(Hijri shamsi)
 * 16 March 2018
 * Author: Fateme Chaji
 */

package ac.um.ds.FiveWayPartition;

public class FiveWayPartition< T extends Comparable< T > > implements IPartition< T >{

    public void Partition(T[] A, T pivot1, T pivot2, int p, int r, int[] q1, int[]  q2, int[] q3, int[] q4)
    {
        //write your code here
        
		int mid1 = p;
		int p1 = p;
		int last1 = r;
		int last2 = r;

		while (mid1 <= last1)
		{
			if (A[mid1].compareTo(pivot1)< 0) {
				swap(A, p1++, mid1++);
			}
			else if (A[mid1] == pivot1) {
				mid1++;
			}
			else {
				swap(A, mid1, last1--);
			}
		}
	
		q1[0] = p1 - 1;
		q2[0] = mid1; 

		int mid2 = q2[0];
		int p2 = q2[0];

		while (mid2 <= last2)
		{
			if (A[mid2].compareTo(pivot2) < 0) {
				swap(A, p2++, mid2++);
			}
			else if (A[mid2] == pivot2) {
				mid2++;
			}
			else {
				swap(A, mid2, last2--);
			}
            q3[0] = p2 - 1;
            q4[0] = mid2;
		}
    }
    public void swap(T[] A, int a, int b){
        T temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
}
