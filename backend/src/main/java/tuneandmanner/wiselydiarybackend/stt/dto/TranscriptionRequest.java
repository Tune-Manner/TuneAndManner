package tuneandmanner.wiselydiarybackend.stt.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class TranscriptionRequest {
	private MultipartFile file;
}
