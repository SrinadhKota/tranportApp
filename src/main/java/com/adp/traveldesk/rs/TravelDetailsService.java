package com.adp.traveldesk.rs;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.adp.traveldesk.vo.VendorDetailsVO;
import com.adp.traveldesk.vo.VendorVehicleDetails;

@RestController
public class TravelDetailsService {

	
	 @PostMapping("/api/updateTransportDetails")
	  public ResponseEntity<?> updateTransportDetails(@RequestBody VendorVehicleDetails vendorVehicleDetails) throws Exception {
		 VendorDetailsVO response = new VendorDetailsVO();
	    return new ResponseEntity<>(response, HttpStatus.OK);

	  }
}
