package cj.life.test.app.web.rest;

import cj.life.ability.api.annotation.ApiResult;
import cj.life.ability.oauth2.app.LifeAppAuthentication;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Api(description = "测试方法权限")
public class TestController {
    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/test")
    @ApiResult
    @ApiOperation("是否有权")
    @ApiResponses({@ApiResponse(responseCode = "2000", description = "ok"),
            @ApiResponse(responseCode = "2001", description = "fuck")})
    public String test() {
        LifeAppAuthentication authentication = (LifeAppAuthentication) SecurityContextHolder.getContext().getAuthentication();
//        throw new RuntimeException("来吧，你说呢:"+authentication.getPrincipal());
        return "来吧，你说呢:" + authentication.getPrincipal();
    }
}
