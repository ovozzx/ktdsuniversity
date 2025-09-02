package com.ktdsuniversity.tmdb;

import java.util.List;
import java.util.stream.Collectors;

import com.ktdsuniversity.tmdb.actr.ActrDao;
import com.ktdsuniversity.tmdb.actr.ActrVO;
import com.ktdsuniversity.tmdb.cst.CstDao;
import com.ktdsuniversity.tmdb.cst.CstVO;
import com.ktdsuniversity.tmdb.gnr.GnrDao;
import com.ktdsuniversity.tmdb.gnr.GnrVO;
import com.ktdsuniversity.tmdb.mkng.MkngDao;
import com.ktdsuniversity.tmdb.mkng.MkngVO;
import com.ktdsuniversity.tmdb.mv.MvDao;
import com.ktdsuniversity.tmdb.mv.MvVO;
import com.ktdsuniversity.tmdb.stff.StffDao;
import com.ktdsuniversity.tmdb.stff.StffVO;


public class TmdbMain {
	
	private MvDao mvDao;
	private GnrDao gnrDao; 
	private MkngDao mkngDao; 
	private CstDao cstDao; 
	private ActrDao actrDao; 
	private StffDao stffDao;
	
	public TmdbMain() {
		this.mvDao = new MvDao();
		this.gnrDao = new GnrDao();
		this.mkngDao = new MkngDao();
		this.cstDao = new CstDao();
		this.actrDao = new ActrDao();
		this.stffDao = new StffDao();
	}

	public MvVO getMovie(String movieId) {
		
		MvVO movie = this.mvDao.getMovie(movieId);
		
		List<GnrVO> genreList = this.gnrDao.getGenre(movieId);
		movie.setGnrList(genreList);
		
		List<MkngVO> makingList = this.mkngDao.getMaking(movieId);

		for(MkngVO making : makingList ) {
			StffVO staff = this.stffDao.getStaff(making.getStffId());
			making.setStff(staff);
			
		}
		
		movie.setMkngList(makingList);
		
		List<CstVO> castingList = this.cstDao.getCasting(movieId);
		
	    for(CstVO cast : castingList ) {
			ActrVO actor = this.actrDao.getActor(cast.getActrId());
			cast.setActr(actor);
		}
	    
		movie.setCstList(castingList);
		
		return movie;
	}
	
	public static void main(String[] args) {
		
		TmdbMain main = new TmdbMain();
		MvVO movie = main.getMovie("16869-inglourious-basterds"); 
		
		System.out.println("------ 영화 정보 ------");
		System.out.println("영화 이름 : " + movie.getTtl());
		System.out.println("영화 연령 등급 : 만 " + movie.getLmtAge() + " 세 이상 관람가");
		System.out.println("영화 시놉시스 : " + movie.getSnpss());
		System.out.println("------ 장르 정보 ------");
		String genre = movie.getGnrList()
					        .stream()
					        .map(gnr -> gnr.getGnrNm())
					        .collect(Collectors.joining(", "));
		System.out.println(genre);
		System.out.println("------ 제작진 정보 ------");
		String staff = movie.getMkngList()
					         .stream()
					         .map(mkng -> mkng.getStff().getStffNm()
					        		 + " / " + mkng.getStffRl()
					        		 + " / " + mkng.getStffPrt())
					         .collect(Collectors.joining("\n"));		
		System.out.println(staff);
		System.out.println("------ 출연진 정보 ------");
		String actor = movie.getCstList()
				            .stream()
				            .map(cst -> cst.getActr().getActrNm()
				            		+ " / " + cst.getActrRlNm())
				            .collect(Collectors.joining("\n"));
		System.out.println(actor);
		
	}
	
}
