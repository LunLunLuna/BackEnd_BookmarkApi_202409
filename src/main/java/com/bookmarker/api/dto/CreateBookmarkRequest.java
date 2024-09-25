package com.bookmarker.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateBookmarkRequest {

    //@NotBlank = trim() + @NotEmpty
    //@NotBlank = white space 허용 안 함
    @NotBlank(message = "Title 은 필수 입력 항목입니다.")
    //@NotBlank(message = "Title should not be empty")
    private String title;

    //@NotEmpty - white space 허용함
    @NotEmpty(message = "Url should not be empty")
    private String url;
}