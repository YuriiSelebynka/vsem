package sel.edu.vsemtheory;

public class MainSequel {

    public static void main(String[] args) {
        // чим відрізняється абстрактний клас від інтерфейса?
        // 1. В більшості випадків в інтерфейсі всі методи абстрактні
          // а в абстрактному класі зазвичай один-два абстрактні.
        // 2. Що таке АБСТРАКТНИЙ метод?
        /*    Це СИГНАТУРА метода. Тобто БЕЗ реалізації.
        *  3. Чи може абстрактний клас НЕ вміщувати абстрактних методів,
        *      МОЖЕ.
        *  4. Чим він тоді відрізняється від звичайного класа?
        *        НЕ МАЄ ОБ`ЄКТІВ.   Can not be instantiated.
        *  5. Чи може абстрактний клас мати ВСІ методи абстрактні?
        *       МОЖЕ без проблем.
        *  6. Чим тоді абстрактний клас відрізняється від інтерфейса?
        *      Ще є поля. Але в принципі, полів може і не бути (без полів не роблять).
        *  7. Що ще є в интерфейсі, окрім сигнатур?
        *       КОНСТАНТИ!!!!
        *  8. Скільки може бути сигнатур в інтерфейсі?
        *             Скільки хочеш! Але пам`ятай про солід.
        *  9. Скільки абстрактних класів можна наслідувати?
        *      ОДИН. На відміну від С++.
        *  10. Чому?
        *      У різних наслідуваних класів можуть бути однакові методи (проблема - який тоді брати?) і поля.
        *  11. А інтерфейсів скільки можна імплементити?
        *         Скільки хочеш!
        *  12. Чи може інтерфейс Не вміщувати сигнатур?
        *              Може. Наприклад, константи.
        *  13. А якщо ні констант, ні сигнатур?
        *     Може. Наприклад, Serializable (Serializable - грубо кажучи, упаковка).
        *  14. Чи можна extends інтерфейс ?
        *     Можна! Іншим інтерфейсом.
        * */



    }
}
