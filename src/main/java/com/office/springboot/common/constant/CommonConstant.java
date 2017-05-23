package com.office.springboot.common.constant;

/**
 * 基本常量设置
 * 
 * @author Neo 2017-5-12
 */
public class CommonConstant {
	public static final String ERRORMSG = "操作数据库异常：";
	public static final String BUSINESSMSG = "数据校验失败：";
	public static final String RETURNMSG = "数据加载失败：";
	public static final String SYSTEM_ERR_MSG = "系统繁忙，请稍候再试";

	/**
	 * 返回响应状态码
	 */
	public static final String RETURN_CODE = "returnCode";
	/**
	 * 返回响应信息
	 */
	public static final String RETURN_MSG = "returnMsg";
	public static final String RETURN_FLAG = "returnFlag";

	public static final String DEFAULT_VERSION = "1.0";
	public static final String ENCODING_UTF8 = "UTF-8";
	public static final String ENCODING_GBK = "GBK";

	public enum CookieAge {
		SESSOIN(60 * 15), NORMALAGE(60 * 60 * 24);

		private CookieAge(int age) {
			this.age = age;

		}

		private int age;

		public int age() {
			return this.age;
		}
	}

	public enum ResponseStatus {
		SUCCESS(ResponseStatusCode.RESPONSE_OK, "操作成功"), ERROR(ResponseStatusCode.RESPONSE_ERROR,
				SYSTEM_ERR_MSG), TIMEOUT(ResponseStatusCode.SESSION_TIME_OUT,
						"用户认证失败,请重新登陆"), FAIL(ResponseStatusCode.VALIDATE_FAIL_FLAG, "操作失败");
		private String returnFlag;
		private String returnMsg;

		private ResponseStatus(String status, String msg) {
			this.returnFlag = status;
			this.returnMsg = msg;

		}

		public String status() {
			return this.returnFlag;
		}

		public String msg() {
			return this.returnMsg;
		}
	}

	public enum SteupType {
		ANDRIOD("A", "hm-health.apk"), IOS("I", "hm-health.ipa"), PLIST("plist", "hm-health-stg.plist");
		private String type;
		private String fileName;

		private SteupType(String type, String fileName) {
			this.type = type;
			this.fileName = fileName;
		}

		public String type() {
			return this.type;
		}

		public String fileName() {
			return this.fileName;
		}
	}

	public enum YesNoFlag {
		YES("Y"), NO("N");
		private String flag;

		private YesNoFlag(String flag) {
			this.flag = flag;
		}

		public String flag() {
			return this.flag;
		}

	}

	public class TableSeqName {
		/** 用户表seq **/
		public static final String T_USER_SEQ = "t_user_seq";
	}

	public class Prefix {
		/** 用户ID前缀 **/
		public static final String USER_ID = "UI";
	}

}
