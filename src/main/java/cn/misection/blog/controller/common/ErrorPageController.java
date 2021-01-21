package cn.misection.blog.controller.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


/**
 * @author Military Intelligence 6 Admin
 * @version 1.0.0
 * @ClassName ErrorPageController
 * @Description 貌似是工厂模式;
 * @createTime 2021年01月21日 17:03:00
 */
@Controller
public class ErrorPageController implements ErrorController
{
    private static ErrorPageController errorPageController;

    @Autowired
    private ErrorAttributes errorAttributes;

    private static final String ERROR_CODE_ATTRIBUTES = "javax.servlet.error.status_code";

    private static final String ERROR_PATH = "/error";

    private static final String FALSE_STRING = "false";

    /**
     * TODO 改为 enum;
     */
    private static final String MAV_ERROR_400_PATH = "error/error_400";

    private static final String MAV_ERROR_404_PATH = "error/error_404";

    private static final String MAV_ERROR_5XX_PATH = "error/error_5xx";


    public ErrorPageController()
    {
        // 要终止递归, 传入带参构造!;
        if (errorPageController == null)
        {
            errorPageController = new ErrorPageController(errorAttributes);
        }
    }

    public ErrorPageController(ErrorAttributes errorAttributes)
    {
        this.errorAttributes = errorAttributes;
    }


    @RequestMapping(value = ERROR_PATH, produces = "text/html")
    public ModelAndView errorHtml(HttpServletRequest request)
    {
        HttpStatus status = this.getStatus(request);

        switch (status)
        {
//            case HttpStatus.BAD_REQUEST:
            case BAD_REQUEST:
            {
                return new ModelAndView(MAV_ERROR_400_PATH);
            }

//            case HttpStatus.NOT_FOUND:
            case NOT_FOUND:
            {
                return new ModelAndView(MAV_ERROR_404_PATH);
            }

            default:
            {
                return new ModelAndView(MAV_ERROR_5XX_PATH);
            }
        }
    }


    /**
     *
     * 注意是responseBody而非request;
     * 这里是返回体;
     * @param request
     * @return
     */
    @RequestMapping(value = ERROR_PATH)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> error
            (HttpServletRequest request)
    {
        Map<String, Object> body = this.getErrorAttributesMap(request, this.getTraceParameter(request));
        HttpStatus status = this.getStatus(request);
        return new ResponseEntity<>(body, status);
    }


    /**
     * 获取堆栈参数;
     * @param request
     * @return
     */
    public boolean getTraceParameter(HttpServletRequest request)
    {
        String paramter = request.getParameter("trace");

        if (paramter == null)
        {
            return false;
        }

        // 如果是equals(false), 返回false, 否则true;
        return !paramter.toLowerCase().equals(FALSE_STRING);
    }


    /**
     * 获取错误信息;
     * @param request
     * @param includeStackTrace
     * @return
     */
    public Map<String, Object> getErrorAttributesMap
            (HttpServletRequest request, boolean includeStackTrace)
    {
        ServletRequestAttributes servletRequestAttributes;
        ServletRequestAttributes servletRequestAttributes2;
        WebRequest webRequest = new ServletWebRequest(request);

        return this.errorAttributes.getErrorAttributes(webRequest, includeStackTrace);
    }


    /**
     * 获取网络状态;
     * @param request
     * @return
     */
    private HttpStatus getStatus(HttpServletRequest request)
    {
        Integer statusCode = (Integer) request.getAttribute(ERROR_CODE_ATTRIBUTES);

        if (statusCode != null)
        {
            try
            {
                return HttpStatus.valueOf(statusCode);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }


    @Override
    public String getErrorPath()
    {
        return ERROR_PATH;
    }
}
