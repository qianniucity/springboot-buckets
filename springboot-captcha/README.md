## 图形验证码
部分html代码
```html
<div class="row m-t" th:if="${captchaEnabled==true}">
						<div class="col-xs-6">
						    <input type="text" name="validateCode" class="form-control code" placeholder="验证码" maxlength="5" autocomplete="off">
						</div>
						<div class="col-xs-6">
							<a href="javascript:void(0);" title="点击更换验证码">
								<img th:src="@{captcha/captchaImage(type=${captchaType})}" class="imgcode" width="85%"/>
							</a>
						</div>
					</div>
```

```js
$(function() {
	validateKickout();
    validateRule();
	$('.imgcode').click(function() {
		var url = ctx + "captcha/captchaImage?type=" + captchaType + "&s=" + Math.random();
		$(".imgcode").attr("src", url);
	});
});

$.validator.setDefaults({
    submitHandler: function() {
		login();
    }
});

```