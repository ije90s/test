package com.test.springboot.web;

<<<<<<< HEAD
import com.test.springboot.config.auth.LoginUser;
import com.test.springboot.config.auth.dto.SessionUser;
import com.test.springboot.service.posts.PostsService;
import com.test.springboot.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.parameters.P;
=======
import com.test.springboot.service.posts.PostsService;
import com.test.springboot.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
>>>>>>> origin/master
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

<<<<<<< HEAD
import javax.servlet.http.HttpSession;

=======
>>>>>>> origin/master
@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

<<<<<<< HEAD

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user){
        model.addAttribute("posts", postsService.findAllDesc());

        if(user != null) {
            model.addAttribute("userName", user.getName());
        }

=======
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
>>>>>>> origin/master
        return "index";
    }

    @GetMapping("/posts/save")
    public String postSave(){
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model){
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);
        return "posts-update";
    }

}
