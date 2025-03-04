package Tarea_3;
public class Cola {
    private long arreglo[];
    private int inicio;
    private int fin;
    private int n;

    public Cola(int n){
        this.arreglo = new long[n+1];
        this.inicio = 0;
        this.fin = 0;
        this.n = n;
    }

    public void insert(long e){
        if(this.fin == n){
            System.out.println("Cola llena");
        }else{
            this.fin = this.fin +1;
            this.arreglo[this.fin] = e;
        }
    }

    public long remove(){
        if(this.inicio == 0 && this.fin == 0){
            System.out.println("Cola vacia");
            return -1;
        }else{
            this.inicio = this.inicio + 1;
            long dato = this.arreglo[this.inicio];

            if(this.inicio == this.fin){
                this.inicio = 0;
                this.fin = 0;
            }
            return dato;
        }
    }

    public long peek(){
        return this.arreglo[this.inicio+1];
    }

    public boolean isEmpty(){
        if(this.inicio == 0 && this.fin == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(this.fin == this.n){
            return true;
        }else{
            return false;
        }
    }

    public int nroelem(){ // size
        return this.fin - this.inicio;
    }

    public static void main(String[] args) {
        Cola cola = new Cola(10);
        cola.insert(1);
        cola.insert(2);
        cola.insert(3);
        cola.insert(4);
        cola.insert(5);
        cola.insert(7);

        //int 5238579
        //log 9835923659869
        
        //float 5.124691
        //double 5.124691264912

        //char 'a'
        //string 'dsgsdg'

        while(! cola.isEmpty()){
            System.out.println(cola.remove());
        }
    }
}
