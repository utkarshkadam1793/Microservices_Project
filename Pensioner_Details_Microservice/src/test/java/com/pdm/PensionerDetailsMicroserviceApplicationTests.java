package com.pdm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.pdm.entity.Details;
import com.pdm.repo.Repo;
import com.pdm.service.DetailsService;

@SpringBootTest
class PensionerDetailsMicroserviceApplicationTests {

	@Autowired
	private DetailsService detailsService;
	
	@MockBean
	private Repo repo;

	@Test
	public void addDetailsTest() {
		Details details=new Details("utkarsh", "01/06/2000", "ABCDE1234F", 10000, 1000, "Self", "ABC", 123456789, "Private", 111122223333L);
		when(repo.save(details)).thenReturn(details);
		assertEquals(details,detailsService.addDetails(details));
	}
	
	@Test
	public void getAllDetailsTest() {
		when(repo.findAll()).thenReturn(Stream.of(new Details("utkarsh", "01/06/2000", "ABCDE1234F", 10000, 1000, "Self", "ABC", 123456789, "Private", 111122223333L),
				new Details("utkarsh", "01/06/2000", "ABCDE1234F", 10000, 1000, "Self", "ABC", 123456789, "Private", 111122223333L)).collect(Collectors.toList()));
		assertEquals(2, detailsService.getAllDetails().size());
	}
	
	@Test
	public void getDetailsTest() {
		Long adhar=111122223333L;
		Details details=new Details("utkarsh", "01/06/2000", "ABCDE1234F", 10000, 1000, "Self", "ABC", 123456789, "Private", 111122223333L);
		when(repo.findById(adhar)).thenReturn(Optional.of(details));
		assertEquals(Optional.of(details),detailsService.getDetails(adhar));
	}
	
	
	@Test
	public void deleteDetailsTest() {
		Long adhar=111122223333L;
		detailsService.deleteDetails(adhar);
		verify(repo, times(1)).deleteById(adhar);
	}
}
