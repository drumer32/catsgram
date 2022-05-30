package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private String id;
    private String username;
    private String nickname;
}
