package com.onlinecourse.microservices.currencyconverterservice;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyExchangeServiceProxy proxyfromto;

	@Autowired
	private CourseBillingServiceProxy proxycoursecost;

//	@GetMapping("/currency-converter/from/{from}/to/{to}/value/{quantity}")
//	public CurrencyConversionBean convertCurrency(@PathVariable String from,
//			@PathVariable String to,
//			@PathVariable BigDecimal quantity
//			){
//		
//		Map<String, String> uriVariables = new HashMap<>();
//		uriVariables.put("from", from);
//		uriVariables.put("to", to);
//
//		ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity(
//				"http://localhost:8000/currency-exchange/from/{from}/to/{to}", 
//				CurrencyConversionBean.class, 
//				uriVariables );   
//		
//		CurrencyConversionBean response = responseEntity.getBody();
//		
//		return new CurrencyConversionBean(response.getId(),from,to,response.getConversionMultiple(),
//				quantity,quantity.multiply(response.getConversionMultiple()),response.getPort()); 
//	}
//	

	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/courseId/{courseId}")
	public CurrencyConversionBean convertCurrencyFeign(@PathVariable String from, @PathVariable String to,
			@PathVariable long courseId) {

		CurrencyConversionBean response = proxyfromto.retrieveExchangeValue(from, to);

		CurrencyConversionBean response2 = proxycoursecost.retriveBillingService(courseId);

		return new CurrencyConversionBean(courseId, response2.getCourseName(), response2.getCoursePrice(),
				response2.getTax(), response2.getDiscount(), response2.getFinalPrice(), from, to,
				response.getConversionMultiple(), response.getConversionFee(),
				(response2.getFinalPrice().divide(response.getConversionMultiple(), 2, RoundingMode.HALF_UP)).add(
						(response2.getFinalPrice().divide(response.getConversionMultiple(), 2, RoundingMode.HALF_UP))
								.multiply(response.getConversionFee()).divide(new BigDecimal(100))),
				response.getPort());
	}

}
