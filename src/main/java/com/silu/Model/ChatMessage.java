package com.silu.Model;


import lombok.*;

@Data
//@Builder
//@RequiredArgsConstructor
@NoArgsConstructor
public class ChatMessage {
    private Long id;
    private String sender;
    private String content;
}
