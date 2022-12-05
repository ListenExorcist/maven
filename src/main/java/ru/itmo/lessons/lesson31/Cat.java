package ru.itmo.lessons.lesson31;

import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class Cat {
    @Setter
    @NonNull
    private String name;
    private String color;
    @Setter
    @ToString.Exclude
    private int age;
}
