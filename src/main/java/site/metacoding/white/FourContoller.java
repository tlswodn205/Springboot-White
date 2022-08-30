package site.metacoding.white;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.white.domain.Four;
import site.metacoding.white.dto.RespDto;

@RestController
public class FourContoller {

	@GetMapping("/four")
	public Four getData() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return four; //dispatcherServlet이 Four 오브젝트를 리턴받고, 해당 오브젝트를 MessageConverter에게 전달한다.
	}
	
	@GetMapping("/four/data")
	public ResponseEntity<Four> getData2() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		ResponseEntity<Four> response = new ResponseEntity<>(four, HttpStatus.OK);
		return response; //dispatcherServlet이 Four 오브젝트를 리턴받고, 해당 오브젝트를 MessageConverter에게 전달한다.
	}
	
//	@GetMapping("/four/dto")
//	public RespDto<?> getData3() {
//		Four four = new Four();
//		four.setTitle("제목");
//		four.setContent("내용");
//		return new RespDto<Four>(1,"성공", four);
//	}
}
