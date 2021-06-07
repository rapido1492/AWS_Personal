package com.lch.admin.springboot.web.web;

import com.lch.admin.springboot.web.service.posts.PostsService;
import com.lch.admin.springboot.web.web.dto.PostsResponseDto;
import com.lch.admin.springboot.web.web.dto.PostsSaveRequestDto;
import com.lch.admin.springboot.web.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PostsApiController.class);

    private final PostsService postsService;
    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PostMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {

        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }
}
