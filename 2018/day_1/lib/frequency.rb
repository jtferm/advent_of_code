require 'set'

class Frequency
  def self.compute(frequencies)
    return frequencies.reduce(&:+)
  end

  def self.find_first_repeat(frequencies)
    results = Set.new
    frequency = 0

    while true
      frequencies.each do |f|
        return frequency unless results.add? frequency
        frequency += f
      end
    end
  end
end
