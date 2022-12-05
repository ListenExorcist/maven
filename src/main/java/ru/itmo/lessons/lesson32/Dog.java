package ru.itmo.lessons.lesson32;

import ru.itmo.lessons.lesson31.Cat;

/**
 * Документация (парсится javadoc плагином)
 * документировать можно классы, свойства, конструкторы, методы
 * Можно использовать текст, html теги, javadoc теги (начинаются с @)
 * Для класса можем указать:
 * @author (только для классов) Костя
 * @version (только для классов) 2.0
 * @since (для свойств, конструкторов, методов, классов) 1.5
 */
public class Dog {
    private String name;
    private int age;
    private String owner;

    /**
     * Описание конструктора
     * @since 1.6
     * @see #Dog(String name, String owner)
     * создает ссылку на класс, свойство, метод, конструктор)
     * @see ru.itmo.lessons.lesson31.Cat
     * @see #age
     * @see #getAge()
     * @see Cat#getAge()
     */
    public Dog() {
    }

    /**
     * @param name - зачем параметр
     * @param owner - зачем параметр
     */
    public Dog(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    /**
     * Описание
     * @return - описывает результат работы метода
     */
    public String getName() {
        return name;
    }

    /**
     * Описание
     * @param name - описание параметра
     * @throws IllegalArgumentException - описание исключительной ситуации
     */
    public void setName(String name) {
        if (name.length() < 3) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
