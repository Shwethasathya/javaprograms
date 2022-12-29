package com.xworkz.collections.dto;

import java.io.Serializable;

public class HolidayDto implements Serializable {

	private String reasonForHoliday;
	private Integer noOfdays;
	private String isItGovernmentHoliday;

	public HolidayDto() {
		// TODO Auto-generated constructor stub
	}

	public HolidayDto(String reasonForHoliday, Integer noOfdays, String isItGovernmentHoliday) {
		super();
		this.reasonForHoliday = reasonForHoliday;
		this.noOfdays = noOfdays;
		this.isItGovernmentHoliday = isItGovernmentHoliday;
	}

	@Override
	public String toString() {
		return "HolidayDto [toString()=" + super.toString() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {

			if (obj instanceof HolidayDto) {
				HolidayDto dto = (HolidayDto) obj;
				if (dto.reasonForHoliday.equals(this.reasonForHoliday)) {
					System.out.println("reasonForHoliday is matching " + dto.reasonForHoliday);
					return true;
				}

			}
		}

		return false;

	}

	public String getReasonForHoliday() {
		return reasonForHoliday;
	}

	public void setReasonForHoliday(String reasonForHoliday) {
		this.reasonForHoliday = reasonForHoliday;
	}

	public Integer getNoOfdays() {
		return noOfdays;
	}

	public void setNoOfdays(Integer noOfdays) {
		this.noOfdays = noOfdays;
	}

	public String getIsItGovernmentHoliday() {
		return isItGovernmentHoliday;
	}

	public void setIsItGovernmentHoliday(String isItGovernmentHoliday) {
		this.isItGovernmentHoliday = isItGovernmentHoliday;
	}

}
