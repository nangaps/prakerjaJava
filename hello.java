class HelloWorld{

    static float luasSegitiga(float alas , float tinggi)
    {
        return (alas*tinggi)/2;

    }

    static float luasPersegiPanjang(float panjang , float tinggi)
    {
        return panjang  * tinggi;
    }

    static double luasLingkaran(double jari)
    {
        return 3.14 * Math.pow(jari,2);
    }

    static void untungRugi(int hargaBeli , int hargaJual)
    {
        if(hargaBeli == hargaJual)
        {
        System.out.println("Harga sama saja");
        }
        else if(hargaBeli > hargaJual)
        {
        System.out.println("untung sebesar : " + (hargaBeli - hargaJual));
        }
        else
        {
        System.out.println("rugi sebesar : " + (hargaBeli - hargaJual));
        }
    }
    public static void main(String[] args){
        System.out.println(luasSegitiga(20,25));
        System.out.println(luasPersegiPanjang(40,6));
        System.out.println(luasLingkaran(7));
        untungRugi(15000,30000 );
        untungRugi(12000,9000);
        untungRugi(12000,12000);
    }
}