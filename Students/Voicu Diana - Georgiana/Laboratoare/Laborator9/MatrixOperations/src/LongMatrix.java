public class LongMatrix extends GenericMatrix<Long> {
	protected Long add(Long o1, Long o2) {
		return o1 + o2;
	}

	@Override
	protected Long multiply(Long o1, Long o2) {
		return o1 * o2;
	}

	@Override 
	protected Long zero() {
		return (long) 0;
	}
}