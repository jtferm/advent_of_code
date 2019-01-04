class Frequency
  def self.compute(frequencies)
    return frequencies.reduce(&:+)
  end
end
