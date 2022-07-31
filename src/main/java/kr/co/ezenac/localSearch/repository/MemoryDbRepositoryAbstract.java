package kr.co.ezenac.localSearch.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class MemoryDbRepositoryAbstract<T> implements MemoryDBRepositoryIfs<T>  {
	
	private final List<T> db = new ArrayList<>();		//db 대신 사용(저장, 삭제 등)
	private int index = 0;
	

	@Override
	public Optional<T> findById(int index) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public T save(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
