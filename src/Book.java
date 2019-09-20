/**
 * @Author : fanc
 * @Date : 2019-09-20 16:02
 */
public class Book {

    boolean checkOut = false;
    Book(boolean checkOut) {
        this.checkOut = checkOut;
    }
    void checkIn() {
        checkOut = false;
    }

    @Override
    protected void finalize() {
        if(checkOut) {
            System.out.println("Error, checked out");
        }
    }


}
