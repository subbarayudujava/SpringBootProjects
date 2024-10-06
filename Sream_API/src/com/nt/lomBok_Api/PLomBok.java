package com.nt.lomBok_Api;

import lombok.Data;
import lombok.NonNull;
@Data
/*@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access =AccessLevel.PROTECTED )
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)*/
public class PLomBok {
	//@NonNull
	private int id;
	private String name;
	private String code;
	//@NonNull
	private Long PhoneNumber;
}
