package org.abuaisyah.grab;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {123, 54, 63, 72, 81, 1234};

        System.out.println(solution2(arr));
    }

    public static int solution3(int[] arr) {
        //total = -1
        int total = -1;
        //siapkan map penampung bilanga, sum nya
        Map<Integer, Integer> mapBilanganSum = new HashMap<>();
        //looping arr
        for (int i=0; i<arr.length; i++) {
            mapBilanganSum.put(arr[i], sum(arr[i]));
        }
        //masukkan ke map yang isinya arr, sum
        //siapkan map sum, bilbaru
        //looping lagi arr

        return total;
    }

    public static int solution2(int[] arr) {
        //siapkan map
        Map<Integer, Integer> map = new HashMap();
        //total = -1
        int total = -1;
        //looping arr
        for (int i=0; i<arr.length; i++) {
            int bilanganBaru = arr[i];
            //cari sum nya
            int sum = sum(bilanganBaru);
            // cari di map ada ndak sum yang sama
            if (map.containsKey(sum)) {
                int bilanganDiMap = map.get(sum).intValue();
                //kalau bil baru > bil yang di simpan di map ganti bil yang disimpan di map
                if (bilanganBaru > bilanganDiMap)
                    map.put(sum, bilanganBaru);
                //subtotal = bil baru + bil yang disimpan di map
                int subTotal = bilanganBaru + bilanganDiMap;
                //klaau subTotal > total
                if (subTotal > total)
                    //total = subTotal
                    total = subTotal;
            } else {
                //kalau ndak ada simpan sum, bilangan baru di map
                map.put(sum, arr[i]);
            }
        }
        return total;
    }

    public static int solution1(int[] A) {
        //arr nya di sorting dulu supaya list nya ndak perlu di sorting lagi
        //loop arr
        //cari sum yang sama jumlahin dan simpan kalau jumlahnya ada yanglebih besar ganti
        //simpan sum nya kalau ada yang sama tandai jadi kalau nanti tidak ada teman jangan jadi hasil
        int total = -1;
        for (int i=0; i<A.length; i++) {
            int sumBilanganPertama = sum(A[i]);
            int bilnganPertama = A[i];
            int currentSum = -1;
            for (int j=i+1; j<A.length; j++) {
                int sumBilanganKedua = sum(A[j]);
                int bilanganKedua = A[j];
                if (sumBilanganPertama == sumBilanganKedua) {
                    currentSum = sumBilanganPertama;
                    if (total == -1) {
                        total = bilnganPertama+bilanganKedua;
                    }
                    if (total < bilnganPertama+bilanganKedua) {
                        total = bilnganPertama+bilanganKedua;
                    }
                }
            }
        }
        return total;
    }

    public static int sum(int value) {
        int sum = 0;
        for (int i=0; i<String.valueOf(value).length(); i++) {
            sum = sum + Integer.parseInt(String.valueOf(value).substring(i,i+1));
        }
        return sum;
    }

    public static int sum1(int value) {
        int sum = 0;
        while (value != 0) {
            sum = sum + value%10;
            value = value / 10;
        }
        return sum;
    }
}
