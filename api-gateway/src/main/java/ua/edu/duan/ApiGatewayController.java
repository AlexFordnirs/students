package ua.edu.duan;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.duan.dto.StudentDto;
import ua.edu.duan.dto.Document;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ApiGatewayController {

    private final StudentFeignClient studentFeignClient;
    @GetMapping(value = "/session")
    public String generateSession(){
        return "Session id will be here";
    }

    @GetMapping(value = "/student")
    public List<StudentDto> getStudents(){
       return studentFeignClient.getStudents();
    }
}
