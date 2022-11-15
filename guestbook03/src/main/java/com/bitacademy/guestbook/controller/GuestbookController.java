package com.bitacademy.guestbook.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitacademy.guestbook.repository.GuestbookRepository;
import com.bitacademy.guestbook.vo.GuestbookVo;

@Controller
public class GuestbookController{
	@Autowired
	private GuestbookRepository guestbookRepository;
	
	public String index(Model model) {
		List<GuestbookVo> list = guestbookRepository.findAll();
		model.addAttribute("list", list);
		return"/WEB-INF/views/index.jsp";
	}
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String delete() {
		return"/WEB-INF/views/add.jsp";
	}
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String delete(GuestbookVo vo) {
		guestbookRepository.insert(vo);
		return "redirect:/";
	}
}
