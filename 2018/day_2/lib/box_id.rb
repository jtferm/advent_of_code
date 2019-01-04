class BoxID
  def initialize(id)
    @letter_counts = Hash.new { |h, k| h[k] = 0 }
    id.chars { |c| @letter_counts[c] += 1 }
  end

  def pair?
    @letter_counts.values.any? { |v| v == 2 }
  end

  def triple?
    @letter_counts.values.any? { |v| v == 3 }
  end
end
