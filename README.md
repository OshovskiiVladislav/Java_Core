# GEEKBRAINS

---

## JAVA 1

---

Lesson 1. Java. Введение
-
1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.<br/>
   _ Orange<br/>
   _ Banana<br/>
   _ Apple<br/>
3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
6. Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают.


Lesson 2. Основные конструкции
-
1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
5. (Дополнительно) Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.


Lesson 3. Практика
-
1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
6. (Дополнительно) Задать одномерный массив и найти в нем минимальный и максимальный элементы;
7. (Дополнительно) Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.<br/>
   Примеры:<br/>
   checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1<br/>
   checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1<br/>

   Граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.

8. (Дополнительно) Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.


Lesson 4. Крестики-нолики в процедурном стиле
-
1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку.
2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
3. (Дополнительно) Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
4. (Дополнительно) Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.


Lesson 5. Введение в ООП
-
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
4. Создать массив из 5 сотрудников.<br/>
   Пример:<br/>
   Person[] persArray = new Person[5]; // Вначале объявляем массив объектов<br/>
   persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект<br/>
   persArray[1] = new Person(...);<br/>
   ...<br/>
   persArray[4] = new Person(...);<br/>

5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.


Lesson 6. Продвинутое ООП
-
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
4. (Дополнительно) Добавить подсчет созданных котов, собак и животных.


Lesson 7. Практика ООП и работа со строками
-
1. Расширить задачу про котов и тарелки с едой.
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку. 

Lesson 8. Написание приложения с графическим интерфейсом
-
1. Калькулятор на Java.

---
---

## JAVA 2

---
Урок 1. Объектно-ориентированное программирование Java
-
1. Написать класс Бэкграунд, изменяющий цвет канвы в зависимости от времени<br/>
2. (Дополнительно) Реализовать добавление новых кружков по клику используя ТОЛЬКО массивы<br/>
3. (Дополнительно) Реализовать по клику другой кнопки удаление кружков (никаких эррейЛист)

Урок 2. Исключения
-
1. Есть строка вида: "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0"; (другими словами матрица 4x4)<br/>
   10 3 1 2<br/>
   2 3 2 2<br/>
   5 6 7 1<br/>
   300 3 1 0<br/>
   Написать метод, на вход которого подаётся такая строка, метод должен преобразовать строку в двумерный массив типа String[][];
2. Преобразовать все элементы массива в числа типа int, просуммировать, поделить полученную сумму на 2, и вернуть результат;
3. Ваши методы должны бросить исключения в случаях:<br/>
   Если размер матрицы, полученной из строки, не равен 4x4;<br/>
   Если в одной из ячеек полученной матрицы не число; (например символ или слово)
4. В методе main необходимо вызвать полученные методы, обработать возможные исключения и вывести результат расчета.
5. (Дополнительно) Написать собственные классы исключений для каждого из случаев

Урок 3. Коллекции
-
1. Создать массив с набором слов (20-30 слов, должны встречаться повторяющиеся):<br/>
- Найти список слов, из которых состоит текст (дубликаты не считать);<br/>
- Посчитать сколько раз встречается каждое слово (использовать HashMap);<br/>
2. Написать простой класс PhoneBook(внутри использовать HashMap):<br/>
- В качестве ключа использовать фамилию<br/>
- В каждой записи всего два поля: phone, e-mail<br/>
- Отдельный метод для поиска номера телефона по фамилии (ввели фамилию, получили ArrayList телефонов), и отдельный метод для поиска e-mail по фамилии. Следует учесть, что под одной фамилией может быть несколько записей. Итого должно получиться 3 класса Main, PhoneBook, Person.

Урок 5. Многопоточность
-
1. Необходимо написать два метода, которые делают следующее:
1) Создают одномерный длинный массив, например:<br/>
```java
static final int size = 10000000;
static final int h = size / 2;
float[] arr = new float[size];
```
2) Заполняют этот массив единицами;<br/>
3) Засекают время выполнения: long a = System.currentTimeMillis();<br/>
4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:<br/>
   arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));<br/>
5) Проверяется время окончания метода System.currentTimeMillis();<br/>
6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a);<br/>

Отличие первого метода от второго:<br/>
Первый просто бежит по массиву и вычисляет значения.<br/>
Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.<br/>

Пример деления одного массива на два:<br/>
```java
System.arraycopy(arr, 0, a1, 0, h);
System.arraycopy(arr, h, a2, 0, h);
```
Пример обратной склейки:<br/>
```java
System.arraycopy(a1, 0, arr, 0, h);
System.arraycopy(a2, 0, arr, h, h);
```
Примечание:<br/>
System.arraycopy() – копирует данные из одного массива в другой:<br/>
System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)<br/>
По замерам времени:<br/>
Для первого метода надо считать время только на цикл расчета:
```java
for (int i = 0; i < size; i++) {
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
}
```
Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.

---
---

## JAVA 3

---

Урок 1. Обобщения
-
1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
2. Написать метод, который преобразует массив в ArrayList;
3. Большая задача:<br/>
   a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)<br/>
   b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;<br/>
   c. Для хранения фруктов внутри коробки можете использовать ArrayList;<br/>
   d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);<br/>
   e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);<br/>
   f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;<br/>
   g. Не забываем про метод добавления фрукта в коробку.<br/>

Lesson 2. Базы данных
-

Урок 3. Средства ввода-вывода
-

Урок 4. Многопоточность. Часть I
-
1. Создать три потока, каждый из которых выводит определенную букву (A, B и C) 5 раз (порядок – ABСABСABС). Используйте wait/notify/notifyAll.
2. На серверной стороне сетевого чата реализовать управление потоками через ExecutorService.

Урок 5. Многопоточность. Часть II
-

Приведённый код перенести в новый проект.<br/>
```java
public class MainClass {
   public static final int CARS_COUNT = 4;
   public static void main(String[] args) {
      System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
      Race race = new Race(new Road(60), new Tunnel(), new Road(40));
      Car[] cars = new Car[CARS_COUNT];
      for (int i = 0; i < cars.length; i++) {
         cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
      }
      for (int i = 0; i < cars.length; i++) {
         new Thread(cars[i]).start();
      }
      System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
      System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
   }
}
public class Car implements Runnable {
   private static int CARS_COUNT;
   static {
      CARS_COUNT = 0;
   }
   private Race race;
   private int speed;
   private String name;
   public String getName() {
      return name;
   }
   public int getSpeed() {
      return speed;
   }
   public Car(Race race, int speed) {
      this.race = race;
      this.speed = speed;
      CARS_COUNT++;
      this.name = "Участник #" + CARS_COUNT;
   }
   @Override
   public void run() {
      try {
         System.out.println(this.name + " готовится");
         Thread.sleep(500 + (int)(Math.random() * 800));
         System.out.println(this.name + " готов");
      } catch (Exception e) {
         e.printStackTrace();
      }
      for (int i = 0; i < race.getStages().size(); i++) {
         race.getStages().get(i).go(this);
      }
   }
}
public abstract class Stage {
   protected int length;
   protected String description;
   public String getDescription() {
      return description;
   }
   public abstract void go(Car c);
}
public class Road extends Stage {
   public Road(int length) {
      this.length = length;
      this.description = "Дорога " + length + " метров";
   }
   @Override
   public void go(Car c) {
      try {
         System.out.println(c.getName() + " начал этап: " + description);
         Thread.sleep(length / c.getSpeed() * 1000);
         System.out.println(c.getName() + " закончил этап: " + description);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }
}
public class Tunnel extends Stage {
   public Tunnel() {
      this.length = 80;
      this.description = "Тоннель " + length + " метров";
   }
   @Override
   public void go(Car c) {
      try {
         try {
            System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         } finally {
            System.out.println(c.getName() + " закончил этап: " + description);
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
public class Race {
   private ArrayList<Stage> stages;
   public ArrayList<Stage> getStages() { return stages; }
   public Race(Stage... stages) {
      this.stages = new ArrayList<>(Arrays.asList(stages));
   }
}
```
Организуем гонки:<br/>
Все участники должны стартовать одновременно, несмотря на то, что на подготовку у каждого из них уходит разное время.<br/>
В туннель не может заехать одновременно больше половины участников (условность).<br/>
Попробуйте всё это синхронизировать.<br/>
Только после того как все завершат гонку, нужно выдать объявление об окончании.<br/>
Можете корректировать классы (в т.ч. конструктор машин) и добавлять объекты классов из пакета util.concurrent.<br/>
Пример выполнения кода до корректировки:<br/>

ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!<br/>
Участник #2 готовится<br/>
ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!<br/>
ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!<br/>
Участник #1 готовится<br/>
Участник #4 готовится<br/>
Участник #3 готовится<br/>
Участник #3 готов<br/>
Участник #3 начал этап: Дорога 60 метров<br/>
Участник #2 готов<br/>
Участник #2 начал этап: Дорога 60 метров<br/>
Участник #1 готов<br/>
Участник #1 начал этап: Дорога 60 метров<br/>
Участник #4 готов<br/>
Участник #4 начал этап: Дорога 60 метров<br/>
Участник #3 закончил этап: Дорога 60 метров<br/>
Участник #3 готовится к этапу(ждет): Тоннель 80 метров<br/>
Участник #3 начал этап: Тоннель 80 метров<br/>
Участник #2 закончил этап: Дорога 60 метров
Участник #2 готовится к этапу(ждет): Тоннель 80 метров<br/>
Участник #2 начал этап: Тоннель 80 метров<br/>
Участник #1 закончил этап: Дорога 60 метров<br/>
Участник #1 готовится к этапу(ждет): Тоннель 80 метров<br/>
Участник #1 начал этап: Тоннель 80 метров<br/>
Участник #4 закончил этап: Дорога 60 метров<br/>
Участник #4 готовится к этапу(ждет): Тоннель 80 метров<br/>
Участник #4 начал этап: Тоннель 80 метров<br/>
Участник #2 закончил этап: Тоннель 80 метров<br/>
Участник #2 начал этап: Дорога 40 метров<br/>
Участник #3 закончил этап: Тоннель 80 метров<br/>
Участник #3 начал этап: Дорога 40 метров<br/>
Участник #2 закончил этап: Дорога 40 метров<br/>
Участник #1 закончил этап: Тоннель 80 метров<br/>
Участник #1 начал этап: Дорога 40 метров<br/>
Участник #4 закончил этап: Тоннель 80 метров<br/>
Участник #4 начал этап: Дорога 40 метров<br/>
Участник #3 закончил этап: Дорога 40 метров<br/>
Участник #1 закончил этап: Дорога 40 метров<br/>
Участник #4 закончил этап: Дорога 40 метров<br/>

Что примерно должно получиться:<br/>

ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!<br/>
Участник #2 готовится<br/>
Участник #1 готовится<br/>
Участник #4 готовится<br/>
Участник #3 готовится<br/>
Участник #2 готов<br/>
Участник #4 готов<br/>
Участник #1 готов<br/>
Участник #3 готов<br/>
ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!<br/>
Участник #2 начал этап: Дорога 60 метров<br/>
Участник #4 начал этап: Дорога 60 метров<br/>
Участник #3 начал этап: Дорога 60 метров<br/>
Участник #1 начал этап: Дорога 60 метров<br/>
Участник #1 закончил этап: Дорога 60 метров<br/>
Участник #3 закончил этап: Дорога 60 метров<br/>
Участник #3 готовится к этапу(ждет): Тоннель 80 метров<br/>
Участник #1 готовится к этапу(ждет): Тоннель 80 метров<br/>
Участник #1 начал этап: Тоннель 80 метров<br/>
Участник #3 начал этап: Тоннель 80 метров<br/>
Участник #4 закончил этап: Дорога 60 метров<br/>
Участник #4 готовится к этапу(ждет): Тоннель 80 метров<br/>
Участник #2 закончил этап: Дорога 60 метров<br/>
Участник #2 готовится к этапу(ждет): Тоннель 80 метров<br/>
Участник #3 закончил этап: Тоннель 80 метров<br/>
Участник #1 закончил этап: Тоннель 80 метров<br/>
Участник #2 начал этап: Тоннель 80 метров<br/>
Участник #4 начал этап: Тоннель 80 метров<br/>
Участник #3 начал этап: Дорога 40 метров<br/>
Участник #1 начал этап: Дорога 40 метров<br/>
Участник #3 закончил этап: Дорога 40 метров<br/>
Участник #3 - WIN<br/>
Участник #1 закончил этап: Дорога 40 метров<br/>
Участник #4 закончил этап: Тоннель 80 метров<br/>
Участник #4 начал этап: Дорога 40 метров<br/>
Участник #2 закончил этап: Тоннель 80 метров<br/>
Участник #2 начал этап: Дорога 40 метров<br/>
Участник #2 закончил этап: Дорога 40 метров<br/>
Участник #4 закончил этап: Дорога 40 метров<br/>
ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!<br/>

Урок 6. Обзор средств разработки
-
1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив. Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException. Написать набор тестов для этого метода (по 3-4 варианта входных данных). Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
2. Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы, то метод вернет false; Написать набор тестов для этого метода (по 3-4 варианта входных данных).

Урок 7. Reflection API и аннотации
-
1. Создать класс, который может выполнять «тесты», в качестве тестов выступают классы с наборами методов с аннотациями @Test. Для этого у него должен быть статический метод start(), которому в качестве параметра передается или объект типа Class, или имя класса. Из «класса-теста» вначале должен быть запущен метод с аннотацией @BeforeSuite, если такой имеется, далее запущены методы с аннотациями @Test, а по завершению всех тестов – метод с аннотацией @AfterSuite. К каждому тесту необходимо также добавить приоритеты (int числа от 1 до 10), в соответствии с которыми будет выбираться порядок их выполнения, если приоритет одинаковый, то порядок не имеет значения. Методы с аннотациями @BeforeSuite и @AfterSuite должны присутствовать в единственном экземпляре, иначе необходимо бросить RuntimeException при запуске «тестирования».

