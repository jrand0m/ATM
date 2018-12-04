package LibraryNew;
import com.sun.xml.internal.ws.server.ServerRtException;
import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    //Данный метод возвращает массив типа Book. В качестве аргументов принимает днинну массива - generatedArray, который далее мы наполняем книгами,
    //так же принимает массив названия книги, массив автора книги и массив года издания книги.
    public static Book[] generateBookArray(int arrLength, String[] names, String[] authorNames, int[] years) {
        Book[] generatedArray = new Book[arrLength]; // создаём массив типа бук для наполнения экземплярами класса Book допустим -(forKids) из раздела книг.
        for (int i = 0; i < generatedArray.length; i++) {//Пробегаем по массиву generatedArray который мы создали для наполнения книг.
            generatedArray[i] = new Book(101 + i, names[i], authorNames[i], years[i]);//При каждой итерации, в массиве generatedArray создаётся экземпляр
            //класса Book с даннымим которые мы принимаем в качестве аргументов метода (names[i],authorNames[i],years[i] - элементы массивов из Main)
            //System.out.println(generatedArray[i]);
        }
        return generatedArray;//возвращаем сгенерированый массив, наполненный созданными книгами.
    }

    //Данный метод принимает массив типа Book и выводит в консоль каждую книгу с новой строки.
    public static void printBook(Book[] array) {//Принимает массив типа Book
        for (int i = 0; i < array.length; i++) {//Пробегает по массиву книг который мы создали методами выше
            System.out.println(array[i]);//Выводит на экран каждыый элемент массива с новой строки
        }
    }

    public static int[] arrPlusPlus(int[] oldArray) { //oldarray = {1,2,3,4,5}; newarray = {0,0,0,0,0,0,0,0};
        int[] newArray = new int[oldArray.length + 3];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

    //Данный метод увеличивает длинну старого метода, который мы передаём в массив на 3 элемента.
    public static Book[] arrAddThree(Book[] oldArray) {//Даный метод возвращает массив типа BOOK метод принимает массив типа BOOK в качестве аргумента
        Book[] newArray = new Book[oldArray.length + 3];//Создаём новый массив типа Book, размером длинны староо массива + 3
        for (int i = 0; i < oldArray.length; i++) {//Пробегаем по старому массиву
            newArray[i] = oldArray[i];//Копируем данные старого массива в новый.
        }
        return newArray;
    }

    //В данном методе мы добавляем книгу в библиотеку, копируя в новый массив данные из старого + 1 новая кнага.
    public static Book[] addBookToLibrary(Book[] oldArray, Book newBook) {
        Book[] newArray = new Book[oldArray.length + 1];//Создаём новый масив длинною старого + 1, т.к. не можем изменить длинну старого.
        for (int i = 0; i < oldArray.length; i++) {//Пробегаем по старому массиу и записываем каждой итерацией данные в новый массив.
            newArray[i] = oldArray[i];    //копируем данные из старого в новый массив.
        }
        newArray[newArray.length - 1] = newBook;//Определяем в последний элемет массива, новую книгу!!!
        return newArray; //возвращаем новый массив.
    }

    public static Book bookRegestration(int id, String bookName, String bookAuthor, int estYear) {
        Book book = new Book(id, bookName, bookAuthor, estYear);
        return book;
    }




    public static void printLibrary(Book[][] library) {
        for (int i = 0; i < library.length; i++) {
            for (int j = 0; j < library[i].length; j++) {
                System.out.println(library[i][j]);

            }

        }

    }

    //Данный метод принимает двумерный массив (всей библиотеки Library) и выводит в консоль всех авторов
    public static void printAuthor(Book[][] Library) {
        for (int i = 0; i < Library.length; i++) {//пробегаем по массиву книжек
            for (int j = 0; j < Library[i].length; j++) {
                Book authorName = Library[i][j];//Выводим в переменную authorName каждый элемент библиотеки (Книгу)
                System.out.println(authorName.getBookAuthor());//Выводим в консоль имена авторов через геттер
            }
        }
    }

    public static void printEstBookYear(Book[][] Library) {
        for (int i = 0; i < Library.length; i++) {
            for (int j = 0; j < Library[i].length; j++) {
                Book books = Library[i][j];
                System.out.println(books.getEstYear());
            }

        }
    }

    public static void printBooksName(Book[][] library) {
        for (int i = 0; i < library.length; i++) {
            for (int j = 0; j < library[i].length; j++) {
                Book bookName = library[i][j];
                System.out.println(bookName.getBookName());
            }
        }
    }

    public static void checkBookExisting(Book[][] library, String newBookName) {
        String result = "This book is't exist";
        for (int i = 0; i < library.length; i++) {
            for (int j = 0; j < library[i].length; j++) {
                Book book = library[i][j];
                if (book.getBookName() == newBookName) {
                    result = "This book already exist";
                }
            }
        }
        System.out.println(result);
    }




    public static Book[][] doubleArrayBook(Book[][] oldArray, int bookId, String bookAuthor, String bookName, int estBook){
        boolean bookExist = false;
        for (int i = 0; i < oldArray.length; i++) {
            for (int j = 0; j < oldArray[i].length; j++) {
                Book books = oldArray[i][j];
                if (books.getBookName() == bookName){
                    bookExist = true;
                    System.out.println("Warning!!! This book already exist");
                break;
                }
            }
        }
        if (bookExist){
            return oldArray;
        }else {
            Book[][] newArray = new Book[oldArray.length][oldArray.length + 1];
            for (int i = 0; i < oldArray.length; i++) {
                for (int j = 0; j < oldArray.length; j++) {
                    newArray[i][j] = oldArray[i][j];
                }
            }
            Book newBook = new Book(bookId,bookName,bookAuthor,estBook);
            newArray[0][newArray.length] = newBook;//вмесо newArray[0] = можно передать аргумент для определения раздела.
            return newArray;
        }

    }

















    public static Book[] bookExistOrNot(Book[] oldArray, int bookId, String bookAuthor, String bookName, int estBook) {
        boolean bookExistens = false;//вспомогательная переменная, ложь по умолчанию
        for (int i = 0; i < oldArray.length; i++) {
            Book book = oldArray[i];
            if (book.getBookName() == bookName) {
                bookExistens = true;
                System.out.println("Warning!!! This book already exist");
                break;
            }
        }
        if (bookExistens) {//значение IF всегда сравнивается True
            return oldArray;
        } else {
            Book[] newArray = new Book[oldArray.length + 1];
            for (int i = 0; i < oldArray.length; i++) {
                newArray[i] = oldArray[i];
                Book newBook = new Book(bookId, bookName, bookAuthor, estBook);
                newArray[newArray.length - 1] = newBook;
            }
            return newArray;
        }
    }


    public static void menu(Book[][] library) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose menu item");
        System.out.println("1 Book registration");
        System.out.println("2 View all books");
        System.out.println("3 View by author");
        System.out.println("4 View by year");

        int i = 0;
        while (i < 4){
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Book book = bookRegestration(0,"Name", "Author", 0000);

                    System.out.println(book);
                    break;
                case 2:
                    printLibrary(library);
                    break;
                case 3:
                    printAuthor(library);
                    break;
                case 4:
                    printEstBookYear(library);
                    break;
                default:
                    System.out.println("Please chose menu item");
            }
            i++;
        }


    }


    public static void main(String[] args) {

//        Book book1 = new Book(1,"Book1","Author1",1981);
//        Book book2 = new Book(2,"Book2","Author2",1981);
//        Book book3 = new Book(3,"Book3","Author3",1981);
//        Book book4 = new Book(4,"Book4","Author4",1981);
//        Book book5 = new Book(5,"Book5","Author5",1981);
//        Book book6 = new Book(6,"Book6","Author6",1981);
//        Book book7 = new Book(7,"Book7","Author7",1981);
//        Book book8 = new Book(8,"Book8","Author8",1981);
//        Book book9 = new Book(9,"Book9","Author9",1981);
//
//        Book[] forKids = new Book[3];
//        forKids [0] = book1;
//        forKids [0] = new Book(1,"Book1","Author1",1981);
//        forKids [1] = book2;
//        forKids [2] = book3;
//
//        Book[] romance = new Book[3];
//        romance [0] = book4;
//        romance [1] = book5;
//        romance [2] = book6;
//
//        Book[] poetry = new Book[3];
//        poetry [0] = book7;
//        poetry [1] = book8;
//        poetry [2] = book9;

        System.out.println("--------------------------------------------forKids------------------------------------------------");
        String[] bookNamesForKids = {"book1", "book2", "book3", "book4", "book5", "book6", "book7", "book8", "book9",};
        String[] bookAuthorsForKids = {"author1", "author2", "author3", "author4", "author5", "author6", "author7", "author8", "author9",};
        int[] estYearForKids = {1988, 8745, 8489, 6124, 7303, 2790, 2680, 1074, 1895};

        System.out.println("--------------------------------------------poetry-------------------------------------------------");
        String[] bookNamesPoetry = {"book1", "book2", "book3", "book4", "book5", "book6", "book7", "book8", "book9",};
        String[] bookAuthorsPoetry = {"author1", "author2", "author3", "author4", "author5", "author6", "author7", "author8", "author9",};
        int[] estYearPoetry = {1988, 8745, 8489, 6124, 7303, 2790, 2680, 1074, 1895};

        System.out.println("---------------------------------------------novel--------------------------------------------------");
        String[] bookNamesNovel = {"book1", "book2", "book3", "book4", "book5", "book6", "book7", "book8", "book9",};
        String[] bookAuthorsNovel = {"author1", "author2", "author3", "author4", "author5", "author6", "author7", "author8", "author9",};
        int[] estYearNovel = {1988, 8745, 8489, 6124, 7303, 2790, 2680, 1074, 1895};
//
//        String[] bookNames = {"book1","book2","book3","book4","book5","book6","book7","book8","book9",};
//        String[] bookAuthors = {"author1","author2","author3","author4","author5","author6","author7","author8","author9",};
//        int[] estYear = {1988,8745,8489,6124,7303,2790,2680,1074,1895};
//
//        String[] bookNames = {"book1","book2","book3","book4","book5","book6","book7","book8","book9",};
//        String[] bookAuthors = {"author1","author2","author3","author4","author5","author6","author7","author8","author9",};
//        int[] estYear = {1988,8745,8489,6124,7303,2790,2680,1074,1895};

//---------------------------------------------------------------------------------------------------------------------------------------------------------

        System.out.println("----------------------------Регистрация книги-----------------------------");
        Book harryPotter = bookRegestration(10, "Harry Potter", "Joahn Rollng", 9637);
        System.out.println(harryPotter);

        Book marryPoppins = bookRegestration(11, "Marry Poppins", "Pamela Lindon", 1865);
        System.out.println(marryPoppins);
//----------------------------------------------------------------------------------------------------------------------------------------------------------

        System.out.println("--------------------Просмотр доступных в библиотеке книг------------------------");

        Book[] forKids = generateBookArray(bookNamesForKids.length/*длинна для массива которую указали в методе*/, bookNamesForKids, bookAuthorsForKids, estYearForKids);
        Book[] poetry = generateBookArray(9/*длинна для массива которую указали в методе*/, bookNamesPoetry, bookAuthorsPoetry, estYearPoetry);
        Book[] novel = generateBookArray(bookNamesNovel.length, bookNamesNovel, bookAuthorsNovel, estYearNovel);

        System.out.println("-------------------------forKids---------------------------");
        printBook(forKids);
        System.out.println("--------------------------poetry--------------------------");
        printBook(poetry);
        System.out.println("--------------------------novel--------------------------");
        printBook(novel);


        System.out.println("-----------------Print library with added book-------------------");
        printBook(addBookToLibrary(forKids, harryPotter));

        //printBook(arrAddThree(forKids));//выводит новый массив увеличенный на 3 элемента;


//        System.out.print(Arrays.toString(forKids)); //Выводит массив в одной строке
//        for (int i = 0; i < forKids.length; i++) {
//            Book forKid = forKids[i];
//            System.out.println(forKid);   //Выводит каждый элемент массива в отдельной строке
//        }
        System.out.println("-------------------------Print Library-----------------------------");
        Book[][] Library = {forKids, poetry, novel}; //Маассив массивов жанров книг
        printLibrary(Library);


        System.out.println("-------------------------------!!!!!!!!!!!!!!!Add Book to library!!!!!!!!!!!!!--------------------------------");
        Book[][] myAddedBook = doubleArrayBook(Library, 111,"wefwef","rlejn",3623);
        printLibrary(myAddedBook);

        //array ++ old new
//        int[] oldArr = {1,2,3,4,5};
//        int[] newArr = new int[oldArr.length + 3];
//        for (int i = 0; i < oldArr.length; i++) {//oldArr cuz newArr.length > oldArr.length; (ArrayIndexOutOfBoundsException)
//            newArr[i] = oldArr[i];
//        }
//        System.out.println(Arrays.toString(newArr));

        System.out.println("-----------------------------------Get Book Author-------------------------------------");
        Book booooooqk = new Book(164, "sthgfwereb", "trseageht", 2673);
        System.out.println(booooooqk.getBookAuthor());
        printAuthor(Library);


        System.out.println("------------------------------Print Est Year-------------------------------");
        printEstBookYear(Library);

        System.out.println("------------------------Get books name---------------------------");
        printBooksName(Library);

        forKids = addBookToLibrary(forKids, harryPotter);

        System.out.println("------------------------Check book existing------------------------------");

        checkBookExisting(Library, "book5");

        System.out.println("------------------------Check book existing------------------------------");


        //System.out.println(Arrays.toString(bookExistOrNot(forKids,42,"w45g45g","book3151",2367)));


        printBook(forKids);

        forKids = bookExistOrNot(forKids, 42, "w45g45g", "book3151", 2367);
        printBook(forKids);


        menu(Library);


    }
}
